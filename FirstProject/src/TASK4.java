public class TASK4 {
    public static void main(String[] args) {
        int amountOfBricks=0;
        do{
            amountOfBricks=(int)(Math.random()*51)+50;
        }while(amountOfBricks % 2 ==0);

        int containerCapacity=0;
        do {
            containerCapacity=(int)(Math.random()*6)+5;
        }while(containerCapacity % 2 !=0);

        int fullContainer=amountOfBricks /containerCapacity;

        int totalContainers  = (int) Math.ceil((double) amountOfBricks / containerCapacity);

        // Calculate how many blocks are in the not completely full container
        int remainingBlocks = amountOfBricks % containerCapacity;

        // Display the results with explanations
        System.out.println("Chosen odd number of Lego bricks: " + amountOfBricks);
        System.out.println("Chosen even number of Lego blocks per container: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainer);
        System.out.println("Number of containers in general (full and not full): " + totalContainers);
        System.out.println("Number of blocks in the not completely full container: " + remainingBlocks);
    }
}
