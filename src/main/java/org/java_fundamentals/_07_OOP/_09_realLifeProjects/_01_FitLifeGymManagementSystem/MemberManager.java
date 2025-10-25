package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.ArrayList;

public class MemberManager {
    ArrayList<Member> members;

    public MemberManager() {
        members = new ArrayList<>();

    }


    public boolean addMember(Member m){
        if (members.contains(m)){
            System.out.println("Member already exists.");
            return false;
        }else {
            members.add(m);
            return true;
        }

    }



    public void listMembers(){
        if (members.isEmpty()){
            System.out.println("There are no members.");
        }else {
            for (Member m: members){
                m.displayInfo();
            }
        }
    }

    public Member findById(String memberId){
        for (Member m: members){
            if (m.getMemberId().equalsIgnoreCase(memberId)){
                return m;
            }
        }
        return null;
    }



    public boolean checkout(String memberId){
        Member m = findById(memberId);
        if (m == null){
            return false;
        }

        if (m.getMembershipStatus().equalsIgnoreCase("Active")){
            double bill = m.calculateBill();
            m.setMembershipStatus("Inactive");
            System.out.println("Final bill for " + m.getName() + ": $" + bill);
            System.out.println("Membership closed.");
            return true;
        }

        System.out.println("Membership is already inactive.");
        return true;


    }
}
