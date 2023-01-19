package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;
// POJO - Plain Old Java Object
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Conversion")
    public double conversion(@WebParam(name = "montant") double  montant) {
        return montant * 10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9000);
    }
    @WebMethod
    public List<Compte> ListComptes(){
        return List.of(
                new Compte(1, Math.random() * 9000),
                new Compte(2, Math.random() * 9000),
                new Compte(3, Math.random() * 9000)

        );
    }
}
