//package ClassExercise7_2;

public class Cmd {
	  public static void main(String[] args) {
	    double[] array = new double[args.length];

	    for (int i = 0; i < args.length; i++) {
	      array[i] = Double.parseDouble(args[i]);
	    }

	    double sum = 0;
	    for (int i=0; i< args.length; i++) {
	      sum += array[i];
	    }
	    double avg = (sum / array.length);
	    System.out.println("Average of the given command line arguments: " + avg);

	    double var = 0;
	    for (int i=0; i< args.length; i++) {
	      var += (array[i] - avg) * (array[i] - avg);
	    }
	    var = (var / array.length);
	    System.out.println("Variance of the given command line arguments: " + var);

	    
	    double min= array[0];
	    for (int i=0; i< args.length; i++) {
	    	if (array[i]< min) {
	    		min=array[i];
	    	}
	    }
	    System.out.println("Minimum vale from the given command line arguments: " + min);

	    
	    double max= array[0];
	    for (int i=0; i< args.length; i++) {
	    	if (array[i]> max) {
	    		max=array[i];
	    	}
	    }
	    System.out.println("Maximum value from the given command line arguments: " + max);
	  }
	}
