package cm.aptoide.pt.download.view;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DownloadEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcm/aptoide/pt/download/view/DownloadEvent;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "INSTALL", "RESUME", "PAUSE", "CANCEL", "GENERIC_ERROR", "OUT_OF_SPACE_ERROR", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DownloadEvent {
    INSTALL,
    RESUME,
    PAUSE,
    CANCEL,
    GENERIC_ERROR,
    OUT_OF_SPACE_ERROR
}