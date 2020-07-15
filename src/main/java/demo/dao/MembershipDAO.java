package demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println(getClass() + " : addAccount()");
    }

    public boolean addAnotherAccount() {
        System.out.println(getClass() + " : addAnotherAccount()");
        return true;
    }

    public void updateAccount() {
        System.out.println(getClass() + " : updateAccount()");
    }
}
