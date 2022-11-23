package execucao;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import tests.booker.CreateBooking;
import tests.booker.CreateToken;
import tests.booker.GetBookingIDs;
import tests.booker.GetBookingsByIDs;

@Suite
@SelectClasses({
        CreateToken.class,
        CreateBooking.class,
        GetBookingIDs.class,
        GetBookingsByIDs.class
})
public class Runner {
}
