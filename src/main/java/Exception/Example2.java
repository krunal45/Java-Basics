package Exception;

class modifiedException extends Exception{
    modifiedException(String s){
        super(s);
    }
}

public class Example2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int div = 0;
        String string = "test";
        int[] nums = {1,2,4};
        try {
            div = b / a;
            System.out.println(nums[2]);
            if (string != null)
                throw new modifiedException("I am calling modified exception");
            else if (string == null) {
                throw new NullPointerException();
            }
        } catch (ArithmeticException e) {
            System.out.println(" Division by zero! " + e);
        }catch (modifiedException e){
            System.out.println(string.length()+" : "+e);
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer Exception! "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is out of Range! "+e);
        }
        catch (Exception e) {
            System.out.println(" Something went wrong! " + e);
        }
        System.out.println(div);
    }
}
