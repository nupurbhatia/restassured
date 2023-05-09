package api.payload;

import java.util.Date;

public class store {
    String id;
    int petId;
    int quantity;
    String shipDate;
    String status;
    Boolean complete;


    public void setId() {
        this.id = String.valueOf(0);
    }

    public void setPetId() {
        this.petId = 0;
    }

    public void setQuantity() {
        this.quantity = 0;
    }

    public void setShipDate() {
        this.shipDate = "2023-04-09T16:25:00.058Z";
    }

    public void setStatus() {
        this.status = "placed";
    }

    public void setComplete() {
        this.complete = true;
    }


    public String getId() {
        return this.id;
    }

    public int getPetId() {
        return this.petId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getShipDate() {
        return this.shipDate;
    }

    public String getStatus() {
        return this.status;
    }

    public Boolean getComplete() {
        return this.complete;
    }



}
