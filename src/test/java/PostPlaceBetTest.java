import Api.PostPlaceBet;
import Models.PlaceBet;
import Models.Row;
import Models.Selection;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PostPlaceBetTest extends TestBaseClassBack {

    @Test
    public void postPlaceBetNew(){
        List<String> selectionKeysList = new ArrayList<>();
        selectionKeysList.add("E354579043B310310OX");

        Row row = new Row();
        row.setAmount(15);
        row.setSelectionKeys(selectionKeysList);

        Selection selection = new Selection();
        selection.setKey("E354579043B310310OX");
        selection.setEventId(354579043);
        selection.setEventStatus(0);
        selection.setHomeName("Hong Kong");
        selection.setAwayName("Cambodia");
        selection.setGameTime("2024-10-15T12:00:00Z");
        selection.setBetTypeId(310310);
        selection.setBetTypeName("FT 1X2");
        selection.setBetStatus(0);
        selection.setOddPrice("3.95");
        selection.setOldOddPrice(null);
        selection.setOddKey("X");
        selection.setOddName("X");
        selection.setOddDisplayName("X");
        selection.setIsLive(false);
        selection.setIsVirtual(false);
        selection.setOrder(1);

        List <Selection> selectionList = new ArrayList<>();
        selectionList.add(selection);

        List<Row> rowList = new ArrayList<>();
        rowList.add(row);

        PlaceBet placeBet = new PlaceBet();
        placeBet.setLanguage("eu-US");
        placeBet.setSelections(selectionList);
        placeBet.setRows(rowList);
        placeBet.setBonusIds(new ArrayList<>());
        placeBet.setTotalStake(0);
        placeBet.setIsBooking(true);

        PostPlaceBet postPlaceBet = new PostPlaceBet();

        postPlaceBet.setRequest(placeBet);
        getResponsePost(postPlaceBet);


        softly.assertThat(postPlaceBet.getResponseBody().getPlacedSuccessfully().equals(true));
        softly.assertThat(postPlaceBet.getResponseBody().getIsSuccessfull().equals(true));
        softly.assertAll();
    }
}
