package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}
