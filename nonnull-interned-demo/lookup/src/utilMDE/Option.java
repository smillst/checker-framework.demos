package utilMDE;


import java.lang.annotation.*;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.checkerframework.framework.qual.DefaultQualifiers;
import org.checkerframework.framework.qual.TypeUseLocation;


/**
 * Indicates that the annotated field is set via command line option.
 * Takes a single string argument that describes the option.  The string
 * is in the format '[-c] [type] description' where '-c' is a single
 * character short name for the option, 'type' is a description of the
 * option more specific than its java type (eg, filename) and 'description'
 * is a description of the option suitable for a usage printout.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@DefaultQualifiers({
  @DefaultQualifier(value = NonNull.class, locations = TypeUseLocation.ALL),
  @DefaultQualifier(value = Nullable.class, locations = TypeUseLocation.TYPE_DECLARATION)
})
public @interface Option {
  String value();
}
