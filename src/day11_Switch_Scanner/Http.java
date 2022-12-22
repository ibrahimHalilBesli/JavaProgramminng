package day11_Switch_Scanner;

public class Http {
        /*
        status code:
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
         */
    public static void main(String[] args) {
        int number = 410;
        String statusCode= "";
        switch (number){
            case 200:
                statusCode= "Ok";
                break;
            case 201:
                statusCode="Created";
                break;
            case 202:
                statusCode="Accepted";
                break;
            case 301:
                statusCode="Moved PErmanently";
                break;
            case 303:
                statusCode="See Other";
                break;
            case 304:
                statusCode="Not Modified";
                break;
            case 307:
                statusCode= "Temporary Redirect";
                break;
            case 400:
                statusCode="Bad Request";
                break;
            case 401:
                statusCode="Unauthiruzed";
                break;
            case 403:
                statusCode="Forbidden";
                break;
            case 404:
                statusCode="Not Found";
                break;
            case 410:
                statusCode="Gone";
                break;
            case 500:
                statusCode="Internal Server Error";
                break;
            case 503:
                statusCode="Service Unavailable";
                break;

        }
        System.out.println(statusCode);

    }
}
