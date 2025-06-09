/*
    Simple Blockchain Guess Game
  
    My very first journey on exploring the blockchain
 
    The blockchain consists of blocks with index, data, previous hash, and hash.
    The player can "mine" blocks by guessing a number. If the guess is correct, a new block is added.
    This game is created based from the previous game created on my repository

*/

import java.util.ArrayList;
import java.util.Scanner;

public class BCguessgame {

    static class Block {
        public int index;
        public String data;
        public int previousHash;
        public int hash;

        public Block(int index, String data, int previousHash) {
            this.index = index;
            this.data = data;
            this.previousHash = previousHash;
            this.hash = calculateHash();
        }

        public int calculateHash() {
            String blockContent = index + data + previousHash;
            return blockContent.hashCode();
        }

        @Override
        public String toString() {
            return "Block #" + index + " [data=" + data + ", previousHash=" + previousHash + ", hash=" + hash + "]";
        }
    }

    static class Blockchain {
        private ArrayList<Block> chain;

        public Blockchain() {
            chain = new ArrayList<>();
            // Create the genesis block
            chain.add(createGenesisBlock());
        }

        private Block createGenesisBlock() {
            return new Block(0, "Genesis Block", 0);
        }

        public Block getLatestBlock() {
            return chain.get(chain.size() - 1);
        }

        public void addBlock(Block newBlock) {
            chain.add(newBlock);
        }

        public boolean isChainValid() {
            for (int i = 1; i < chain.size(); i++) {
                Block currentBlock = chain.get(i);
                Block previousBlock = chain.get(i - 1);

                if (currentBlock.previousHash != previousBlock.hash) {
                    return false;
                }
                if (currentBlock.hash != currentBlock.calculateHash()) {
                    return false;
                }
            }
            return true;
        }

        public void printBlockchain() {
            System.out.println("Current Blockchain:");
            for (Block block : chain) {
                System.out.println(block);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();

        System.out.println("Welcome to the Simple Blockchain Game!");
        System.out.println("Try to guess the secret number (between 1 and 5) to mine a new block.");
        System.out.println("Type 'exit' to quit the game.");

        while (true) {
            System.out.print("\nEnter your guess: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            int secretNumber = (int) (Math.random() * 5) + 1;

            try {
                int guess = Integer.parseInt(input);

                if (guess < 1 || guess > 5) {
                    System.out.println("Please guess a number between 1 and 5.");
                    continue;
                }

                if (guess == secretNumber) {
                    Block latestBlock = blockchain.getLatestBlock();
                    int newIndex = latestBlock.index + 1;
                    String newData = "Block mined with guess " + guess;
                    int previousHash = latestBlock.hash;
                    Block newBlock = new Block(newIndex, newData, previousHash);
                    blockchain.addBlock(newBlock);
                    System.out.println("Congratulations! You mined a new block:");
                    System.out.println(newBlock);
                } else {
                    System.out.println("Wrong guess! The secret number was " + secretNumber + ". Try again.");
                }

                if (!blockchain.isChainValid()) {
                    System.out.println("Warning! Blockchain integrity compromised.");
                    break;
                }

                blockchain.printBlockchain();

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number between 1 and 5 or 'exit' to quit.");
            }
        }

        scanner.close();
    }
}

