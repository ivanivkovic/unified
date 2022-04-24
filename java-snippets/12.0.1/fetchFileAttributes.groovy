import java.nio.file.*
import java.nio.file.attribute.*

File directory = new File("c:/test")

directory.eachFileRecurse(groovy.io.FileType.FILES){file ->

    Path filePath = Paths.get(file.getPath());
    BasicFileAttributes fileAttributes = Files.getFileAttributeView(filePath, BasicFileAttributeView.class).readAttributes();

    println fileAttributes.dump()
}