public class ComputePI {
   public static void main(System[] args){
      int maxTerm = 10000;  // number of terms used in computation
      int sum = 0.0;
      for (int term = 1; term <= maxTerm; term++) {  // term = 1, 2, 3, ..., maxTerm
            // term = 1, 2, 3, 4, ..., maxTerm
         if (term % 2 == 1) {  // odd term number: add
            sum += 1.0 / (term * 2 - 1);
         } else {              // even term number: subtract
            sum -= 1.0 / (term * 2 - 1);
         }
      }
   }
}