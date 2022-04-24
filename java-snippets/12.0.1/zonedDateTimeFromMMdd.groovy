import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField

/**
 * Get current year
 *
 * @return Integer year
 */
Integer getCurrentYear(){
    return LocalDate.now().getYear()
}

/**
 * Parse datetime string with a missing year
 * Returns zoned datetime of current year, in source timezone
 *
 * @param fileDateTime
 * @param format
 * @param timeZoneId
 *
 * @return ZonedDateTime with current year in UTC
 */
ZonedDateTime parseDateWithoutYear(String fileDateTime, String dateFormat, String timeZoneId){
    try {
        // Create formatter & local datetime
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().
                appendPattern(dateFormat).
                parseDefaulting(ChronoField.YEAR, getCurrentYear()).
                toFormatter()

        LocalDateTime dateTime = LocalDateTime.parse(fileDateTime, formatter)

        // Convert to zoned datetime and return
        ZoneId timezoneId = ZoneId.of(timeZoneId)

        return ZonedDateTime.of(dateTime, timezoneId)
    }
    catch (Exception e) {
        println e.getMessage()
    }
}

final String SOURCE_TIME_ZONE = "Europe/Zagreb"
final String SOURCE_DATETIME_FORMAT = "MM-dd HH:mm"

// Create zoned datetime from string without year && assign current year
ZonedDateTime sendDateTime = parseDateWithoutYear("03-25 22:22", SOURCE_DATETIME_FORMAT, SOURCE_TIME_ZONE)

println sendDateTime.dump()