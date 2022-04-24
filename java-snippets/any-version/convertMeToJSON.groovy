import groovy.json.JsonBuilder

@Override
public String toString() {
    return new JsonBuilder(this).toPrettyString()
}