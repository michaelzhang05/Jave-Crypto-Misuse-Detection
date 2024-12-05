package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class Room {
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String str) {
        boolean z8;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(klass, "klass");
        if (str != null && !g6.n.u(str)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (true ^ z8) {
            return new RoomDatabase.Builder<>(context, klass, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T, C> T getGeneratedImplementation(Class<C> klass, String suffix) {
        String str;
        AbstractC3159y.i(klass, "klass");
        AbstractC3159y.i(suffix, "suffix");
        Package r12 = klass.getPackage();
        AbstractC3159y.f(r12);
        String fullPackage = r12.getName();
        String canonicalName = klass.getCanonicalName();
        AbstractC3159y.f(canonicalName);
        AbstractC3159y.h(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC3159y.h(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = g6.n.z(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            AbstractC3159y.g(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }
}
