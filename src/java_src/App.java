package java_src;


import java_src.DAO.LoginDAOpostgress;

public class App
{
    public static void main( String[] args ) {


        LoginDAOpostgress DAO = new LoginDAOpostgress();
        DAO.getUsersListFromDataBase();
    }
}
