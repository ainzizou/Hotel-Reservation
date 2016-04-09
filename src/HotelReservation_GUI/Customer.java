/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservation_GUI;

/**
 *
 * @author Achmad Zulkarnain
 */
public class Customer {

    private String name;
    private int id;
    private String address;
    private String room;
    private String roomtype;
    private String checkin;
    private int numnight;

    public Customer(String name, int id, String address, String room, String roomtype, String checkin, int numnight) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.room = room;
        this.roomtype = roomtype;
        this.checkin = checkin;
        this.numnight = numnight;
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getRoom(){
        return room;
    }
    
    public String getRoomType(){
        return roomtype;
    }
    
    public String getChckIn(){
        return checkin;
    }
    public int getNumNight(){
        return numnight;
    }
}
