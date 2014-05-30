/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch3.defaultValidate;

/**
 *
 * @author sungwoo
 */
public class RequestDataDefault {
    
    private String hobby;

    /**
     * Get the value of hobby
     *
     * @return the value of hobby
     */
    public String getHobby() {
        if (isValidHobby()) {
            return hobby;
        }
        return "No Hobby";
    }

    /**
     * Set the value of hobby
     *
     * @param hobby new value of hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isValidHobby() {
        return hobby != null && !hobby.trim().equals("");
    }

    private String aversion;

    /**
     * Get the value of aversion
     *
     * @return the value of aversion
     */
    public String getAversion() {
        return aversion;
    }

    /**
     * Set the value of aversion
     *
     * @param aversion new value of aversion
     */
    public void setAversion(String aversion) {
        this.aversion = aversion;
    }

    
}
