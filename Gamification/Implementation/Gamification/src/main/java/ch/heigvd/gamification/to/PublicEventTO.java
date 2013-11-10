/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.gamification.to;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jean-Luc
 */
@XmlRootElement
public class PublicEventTO {

    private long id;
    private String type;
    private long time;
    //private PublicApplicationTO applicationTO;
    //private PublicPlayerTO playerTO;

    public PublicEventTO() {
    }

    public PublicEventTO(long id, String type, Long time) {
        this.type = type;
        this.id = id;
        this.time = time;
        //this.applicationTO = app;
        //this.playerTO = player;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

}
