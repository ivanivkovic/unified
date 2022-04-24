import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.OffsetDateTime

/**
 * Input: "2021.03.22 13:15"
 * Output: 1616415300000
 *
 * @param sendAt
 * @param format
 *
 * @return epoch miliseconds
 */
Long localDateTimeStringToEpochMili(String sendAt, String format){
    DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(format).toFormatter()
    LocalDateTime dateTime = LocalDateTime.parse(sendAt, formatter)

    return dateTime.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli()
}

final String INCOMING_TIMESTAMP_FORMAT = 'yyyy.MM.dd HH:mm'

println localDateTimeStringToEpochMili("2021.03.22 13:15", INCOMING_TIMESTAMP_FORMAT)
