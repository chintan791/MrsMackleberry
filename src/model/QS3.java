package model;import javax.persistence.EntityManager;  


import model.DBUtil; 

public class QS3 {
    public String Studentrecord() {
        String result="";
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            model.Gradebook stud = em.find(model.Gradebook.class, (long)2);
            result=stud.toString();
            System.out.println(stud.getAssignmentname());
        } catch (Exception e){
            System.out.println(e);
        } finally {
            em.close();
            System.out.println("cerrado!");
        }
        return result;
    }
}