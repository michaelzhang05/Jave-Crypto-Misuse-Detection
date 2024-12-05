package androidx.room.util;

import Y5.b;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class ViewInfo {
    public static final Companion Companion = new Companion(null);
    public final String name;
    public final String sql;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final ViewInfo read(SupportSQLiteDatabase database, String viewName) {
            ViewInfo viewInfo;
            AbstractC3255y.i(database, "database");
            AbstractC3255y.i(viewName, "viewName");
            Cursor query = database.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    AbstractC3255y.h(string, "cursor.getString(0)");
                    viewInfo = new ViewInfo(string, query.getString(1));
                } else {
                    viewInfo = new ViewInfo(viewName, null);
                }
                b.a(query, null);
                return viewInfo;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(query, th);
                    throw th2;
                }
            }
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public ViewInfo(String name, String str) {
        AbstractC3255y.i(name, "name");
        this.name = name;
        this.sql = str;
    }

    public static final ViewInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (AbstractC3255y.d(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null) {
                z8 = AbstractC3255y.d(str, str2);
            } else if (str2 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = this.name.hashCode() * 31;
        String str = this.sql;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
