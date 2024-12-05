package cm.aptoide.pt.download;

import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: SplitTypeSubFileTypeMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcm/aptoide/pt/download/SplitTypeSubFileTypeMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapSplitToSubFileType", HttpUrl.FRAGMENT_ENCODE_SET, "splitType", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplitTypeSubFileTypeMapper {
    public final int mapSplitToSubFileType(String splitType) {
        l.f(splitType, "splitType");
        if (l.a(splitType, "FEATURE")) {
            return 11;
        }
        return l.a(splitType, "ASSET") ? 12 : 15;
    }
}
