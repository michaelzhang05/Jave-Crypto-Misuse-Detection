package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: MediaDescriptionCompatApi23.java */
/* loaded from: classes.dex */
class c {

    /* compiled from: MediaDescriptionCompatApi23.java */
    /* loaded from: classes.dex */
    static class a {
        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
