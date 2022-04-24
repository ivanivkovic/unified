import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

ZoneId zoneId = ZoneId.of("Asia/Riyadh")
ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId)

String now = zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)