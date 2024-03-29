package practice;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
        
public class StackIntGenerator extends Generator<int[][]> {
    
    public StackIntGenerator() {
        super(int[][].class);
    }

    @Override
    public int[][] generate(SourceOfRandomness random, GenerationStatus status) {
        
        int length = random.nextInt(1, 30); //generate a random length
        int[][] array = new int[2][length];
        for (int i = 0; i < length; i++) {
            int input = random.nextInt(-1,100);
            array[0][i] = input;
            array[1][i] = random.nextInt(1,4); //generate a random integer having 1,2,3
        }

        return array;
    }


    // @Override
    // public int[][] generate(SourceOfRandomness random, GenerationStatus status) {
        
    //     int length = random.nextInt(1, 30); //generate a random length
    //     // int actualLength = random.nextInt(0, length);
    //     int[][] array = new int[2][length];
    //     for (int i = 0; i < length; i++) {
    //         int input = random.nextInt(-1,100);
    //         int zeroOrOne = random.nextInt(0,2);
    //         // if(i==20){
    //         //     if(zeroOrOne == 0) {
    //         //         int randomIndex = random.nextInt(0,20);
    //         //         array[0][i] = array[0][randomIndex];
    //         //     }
    //         //     else
    //         //     array[0][i] = input;
    //         // }
    //         // else
    //         array[0][i] = input;
    //         // array[0][i] = random.nextInt(-1,100); //generate a random integer and put it in the array
    //         array[1][i] = random.nextInt(1,4); //generate a random integer having 1,2,3
    //     }

    //     return array;
    // }


    // @Override
    // public int[] generate2(SourceOfRandomness random, GenerationStatus status) {
        
    //     int length = random.nextInt(1, 10); //generate a random length
    //     // int actualLength = random.nextInt(0, length);

    //     int [] array2 = new int[length];
    //     for (int i = 0; i < length; i++) {
    //         array2[i] = random.nextInt(1,3); //generate a random integer 1, 2, and 3
    //     }

    //     return array2;
    // }


} 


// public class StackIntGenerator extends Generator<Integer> {
    
//     public StackIntGenerator() {
//         super(Integer.class);
//     }

//     @Override
//     public Integer generate(SourceOfRandomness random, GenerationStatus status) {
        
//         int randomNum = random.nextInt(); // generate a random number
//         return randomNum;
//     }


// } 

// @Override
//     public Object[] generate(SourceOfRandomness random, GenerationStatus status) {
        
//         int length = random.nextInt(1, 10); //generate a random length
//         // int actualLength = random.nextInt(0, length);
//         int[] array = new int[length];
//         int [] array2 = new int[length];
//         for (int i = 0; i < length; i++) {
//             array[i] = random.nextInt(); //generate a random integer and put it in the array
//             array2[i] = random.nextInt(1,3); //generate a random integer 1, 2, and 3
//         }

//         return new Object[]{array, array2};
//     }
