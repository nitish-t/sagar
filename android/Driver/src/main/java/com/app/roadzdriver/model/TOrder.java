package com.app.roadzdriver.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TOrder implements Serializable {

    @JsonProperty("subscriber_id")
    private int subscriberId;

    @JsonProperty("service")
    private TService service;

    @JsonProperty("service_id")
    private int serviceId;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("id")
    private int id;

    @JsonProperty("subscription")
    private TSubscription subscription;

    @JsonProperty("customer_id")
    private int customerId;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("status")
    private String status;

    @JsonProperty("customer")
    private TUser customer;

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getSubscriberId() {
        return subscriberId;
    }


    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public TService getService() {
        return service;
    }

    public void setService(TService service) {
        this.service = service;
    }

    public TSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(TSubscription subscription) {
        this.subscription = subscription;
    }

    public TUser getCustomer() {
        return customer;
    }

    public void setCustomer(TUser customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return
                "TOrder{" +
                        "subscriber_id = '" + subscriberId + '\'' +
                        ",service = '" + service + '\'' +
                        ",service_id = '" + serviceId + '\'' +
                        ",latitude = '" + latitude + '\'' +
                        ",id = '" + id + '\'' +
                        ",subscription = '" + subscription + '\'' +
                        ",customer_id = '" + customerId + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        ",status = '" + status + '\'' +
                        ",customer = '" + customer + '\'' +
                        "}";
    }
}