package domain;

public class Vaucher {
    private String identity;
    private String type;
    private String country;
    private Integer days;
    private Integer deltaNights;
    private TransportType transportType;
    private Long cost;
    private HotelCharacteristic hotelCharacteristic;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getDeltaNights() {
        return deltaNights;
    }

    public void setDeltaNights(Integer deltaNights) {
        this.deltaNights = deltaNights;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public HotelCharacteristic getHotelCharacteristic() {
        return hotelCharacteristic;
    }

    public void setHotelCharacteristic(HotelCharacteristic hotelCharacteristic) {
        this.hotelCharacteristic = hotelCharacteristic;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: ").append(getIdentity()).append('\n');
        builder.append("Вид путёвки: ").append(getType()).append('\n');
        builder.append("Страна: ").append(getCountry()).append('\n');
        builder.append("Количество дней/ночей: ").append(getDays()).append('/').append(getDays() + getDeltaNights()).append('\n');
        builder.append("Транспорт: ").append(getTransportType().getName()).append('\n');
        builder.append("Характеристика отеля\n");
        builder.append("\tКоличество звёзд: ").append(getHotelCharacteristic().getStarsCount()).append('\n');
        builder.append("\tЕсть ли телевизор: ").append(getHotelCharacteristic().isTV()).append('\n');
        builder.append("\tПитание: ").append(getHotelCharacteristic().getFood()).append('\n');
        builder.append("Стоимость: ").append(getCost()).append('\n');
        return builder.toString();
    }
}