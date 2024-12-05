package okhttp3.internal.http;

import j.h;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: RealResponseBody.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "Lj/h;", "source", "()Lj/h;", "J", "Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "contentTypeString", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;JLj/h;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final h source;

    public RealResponseBody(String str, long j2, h hVar) {
        l.f(hVar, "source");
        this.contentTypeString = str;
        this.contentLength = j2;
        this.source = hVar;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source, reason: from getter */
    public h getSource() {
        return this.source;
    }
}
