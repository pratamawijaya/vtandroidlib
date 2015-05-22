package id.co.veritrans.android.api.VTModel;

/**
 * Created by muhammadanis on 5/22/15.
 */
public class VTTwoClicksTwoDetails extends VTCardDetails {
    private boolean isTwoClicks;
    private String tokenId;

    public boolean isTwoClicks() {
        return isTwoClicks;
    }

    public void setIsTwoClicks(boolean isTwoClicks) {
        this.isTwoClicks = isTwoClicks;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
