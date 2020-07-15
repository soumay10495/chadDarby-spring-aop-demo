package demo.dao;

import demo.bean.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {
    private String name;
    private String field;

    public AccountDAO() {
    }

    public List<Account> getAccounts(Boolean flag) {
        if (flag)
            throw new RuntimeException("Flag true exception");

        List<Account> accountList = new ArrayList<Account>();

        accountList.add(new Account("Sam", "1"));
        accountList.add(new Account("Jack", "2"));
        accountList.add(new Account("Goku", "3"));

        return accountList;
    }

    public void addAccount(Account account, boolean flag) {
        System.out.println(getClass() + " : addAccount(Account, boolean)");
    }

    @Override
    public String toString() {
        return "AccountDAO{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                '}';
    }

    public void removeAccount() {
        System.out.println(getClass() + " : removeAccount()");
    }

    public String getName() {
        System.out.println("Inside method getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside method setName()");
        this.name = name;
    }

    public String getField() {
        System.out.println("Inside method getField()");
        return field;
    }

    public void setField(String field) {
        System.out.println("Inside method setField()");
        this.field = field;
    }
}
