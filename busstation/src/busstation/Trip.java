package busstation;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

//package busstation;



	public class Trip {
		private final SimpleStringProperty Source; 
		private final SimpleStringProperty Destination; 
		private final SimpleStringProperty VechileNumber; 
		private final SimpleStringProperty DriverAssign; 
		private final SimpleStringProperty DepratureTime; 
		private final SimpleStringProperty ArrivalTime; 
		private final SimpleStringProperty TripType; 
		private final SimpleStringProperty TYPEOFVechile; 
		private final SimpleStringProperty NumberTrip; 
		private final SimpleIntegerProperty Price;
		
		public Trip(String source, String destination, String vechileNumber, String driverAssign, String depratureTime,
				String arrivalTime, String tripType, String tYPEOFVechile, String numberTrip, Integer price) {
			super();
			this.Source =new SimpleStringProperty(source);
			this.Destination = new SimpleStringProperty(destination);
			this.VechileNumber =new SimpleStringProperty(vechileNumber);
			this.DriverAssign = new SimpleStringProperty(driverAssign);
			this.DepratureTime = new SimpleStringProperty(depratureTime);
			this.ArrivalTime =new SimpleStringProperty(arrivalTime);
			this.TripType = new SimpleStringProperty(tripType);
			this.TYPEOFVechile = new SimpleStringProperty(tYPEOFVechile);
			this.NumberTrip = new SimpleStringProperty(numberTrip);
			this.Price =new SimpleIntegerProperty(price);
		}

		public String getSource() {
			return Source.get();
		}

		public String getDestination() {
			return Destination.get();
		}

		public String getVechileNumber() {
			return VechileNumber.get();
		}

		public String getDriverAssign() {
			return DriverAssign.get();
		}

		public String getDepratureTime() {
			return DepratureTime.get();
		}

		public String getArrivalTime() {
			return ArrivalTime.get();
		}

		public String getTripType() {
			return TripType.get();
		}

		public String getTYPEOFVechile() {
			return TYPEOFVechile.get();
		}

		public String getNumberTrip() {
			return NumberTrip.get();
		}

		public Integer getPrice() {
			return Price.get();
		} 
		
		
		
		

	}

	

	


