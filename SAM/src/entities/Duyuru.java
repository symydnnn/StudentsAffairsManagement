/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Duyuru {
    private int idActivity;
    private String activityName;
    private String content;
    private String activityDate;

    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }
    
    
    public Duyuru(int idActivity, String activityName, String content, String activityDate) {
        this.idActivity = idActivity;
        this.activityName = activityName;
        this.content = content;
        this.activityDate = activityDate;
    }
    
}
