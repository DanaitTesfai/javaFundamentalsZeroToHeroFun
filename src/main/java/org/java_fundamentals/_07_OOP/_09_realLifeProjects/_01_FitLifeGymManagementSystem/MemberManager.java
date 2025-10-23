package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.ArrayList;

public class MemberManager {
    ArrayList<Member> members = new ArrayList<>();

    public MemberManager() {
    // TODO: initialize ArrayList
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



    public boolean listMembers(){
        if (members.isEmpty()){
            System.out.println("There are no members.");
            return false;
        }else {
            for (Member m: members){
                m.displayInfo();
            }
            return true;
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



    public void checkout(String memberId){
        System.out.println("check out");

    }
}
