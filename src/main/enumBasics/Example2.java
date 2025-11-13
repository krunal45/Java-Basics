package main.enumBasics;

enum HTTP_STATUS_CODES{
    Sucess,Failure,Redirect
}

public class Example2 {
    public static void main(String[] args) {
        HTTP_STATUS_CODES[] statusCodes = HTTP_STATUS_CODES.values();
        for (HTTP_STATUS_CODES status_code:statusCodes)
            System.out.println(status_code+" : "+status_code.ordinal());
    }
}
