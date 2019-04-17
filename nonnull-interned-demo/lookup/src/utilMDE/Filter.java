package utilMDE;



import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.checkerframework.framework.qual.DefaultQualifiers;
import org.checkerframework.framework.qual.TypeUseLocation;

/**
 * Interface for things that make boolean decisions.
 * This is inspired by java.io.FilenameFilter.
 **/
@DefaultQualifiers({
  @DefaultQualifier(value = NonNull.class, locations = TypeUseLocation.ALL),
  @DefaultQualifier(value = Nullable.class, locations = TypeUseLocation.TYPE_DECLARATION)
})
public interface Filter<T> {
  /** Tests whether a specified Object satisfies the filter. */
  boolean accept(T o);
}
