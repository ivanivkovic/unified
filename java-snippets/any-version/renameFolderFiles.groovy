import groovy.io.FileType

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

File folder = new File('c:/emojis')

def folderName = ""

folder.eachFileRecurse FileType.FILES,  { file ->

    // do nothing if the file ends with a .txt extension
    
    println "Processing file ${file.absolutePath}"
    
	folderName = file.getParentFile().getName()
	extension = file.name.takeRight(file.name.size() - file.name.lastIndexOf('.'))

    Files.move(file.toPath(), Paths.get("c:/emojis/${folderName}${extension}"))

    println "Name should be c:/emojis/${folderName}${extension}"
}
