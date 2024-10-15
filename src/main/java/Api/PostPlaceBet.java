package Api;

import Models.AbstractTest;
import Models.PlaceBet;
import Models.PlaceBetResponse;

public class PostPlaceBet implements AbstractTest<PlaceBet, PlaceBetResponse,PlaceBet> {

    private String url;
    private PlaceBet request;
    private PlaceBetResponse response;

    public PostPlaceBet() {
        this.request = new PlaceBet();
        this.url = "https://s.gsb.co.zm/services/clapi/api/Bet/placebetsport";
    }

    public PlaceBet getRequestBody() {
        return request;
    }

    public PlaceBet getRequest() {
        return request;
    }

    public void setRequest(PlaceBet request) {
        this.request = request;
    }


    public String getUrl() {
        return url;
    }


    private void setResponse(PlaceBetResponse response) {
        this.response = response;
    }

    public void setResponse(Object response) {
        setResponse((PlaceBetResponse) response);
    }

    public PlaceBetResponse getResponseBody() {
        return response;
    }

    public Class<PlaceBetResponse> getResponseClass() {
        return PlaceBetResponse.class;
    }

}
