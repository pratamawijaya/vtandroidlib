package id.co.veritrans.android.api;

import java.util.Map;

import id.co.veritrans.android.api.VTInterface.ITokenCallback;
import id.co.veritrans.android.api.VTModel.VTBaseTransaction;
import id.co.veritrans.android.api.VTModel.VTToken;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by Anis on 11/12/2014.
 */
public abstract class VTBaseTransactionMethod {
    protected VTBaseTransaction transaction;

    public abstract void preAuthorize();
    public abstract void capture();
    public abstract void charge();

    public abstract void getToken(ITokenCallback callback);

    public VTBaseTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(VTBaseTransaction transaction) {
        this.transaction = transaction;
    }

    public interface GetToken {
        @GET("/")
        VTToken doGetToken(@QueryMap Map<String, String> option);
    }

}
