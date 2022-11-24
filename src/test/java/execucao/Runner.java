package execucao;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import tests.booker.*;

@Suite
@SelectClasses({
        CreateToken.class,
        CreateBooking.class,
        GetBookingIDs.class,
        GetBookingsByIDs.class,
        UpdateBooking.class
})
public class Runner {
}
