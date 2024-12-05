package okhttp3;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.dataprovider.BuildConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.u;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: HttpUrl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\u0013\u0018\u0000 W2\u00020\u0001:\u0002XWBc\b\u0000\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010.\u001a\u00020\n\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00104\u001a\u00020\n\u0012\u0006\u00106\u001a\u00020\u0011\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0010\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e\u0012\b\u0010M\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\bU\u0010VJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010\bJ\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010.\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u0017J\u000f\u00100\u001a\u00020\nH\u0007¢\u0006\u0004\b/\u0010\u0017J\u000f\u00102\u001a\u00020\nH\u0007¢\u0006\u0004\b1\u0010\u0017J\u000f\u00104\u001a\u00020\nH\u0007¢\u0006\u0004\b3\u0010\u0017J\u000f\u00106\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010$J\u000f\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b7\u0010$J\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\u0017J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b>\u0010<J\u0011\u0010A\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b@\u0010\u0017J\u0011\u0010C\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bB\u0010\u0017J\u000f\u0010E\u001a\u00020\u0011H\u0007¢\u0006\u0004\bD\u0010$J\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0FH\u0007¢\u0006\u0004\bG\u0010HJ\u0011\u0010K\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bJ\u0010\u0017J\u0011\u0010M\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bL\u0010\u0017R\u0019\u00104\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\b4\u0010\u0017R\u0019\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0F8G@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0019\u00102\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\b2\u0010\u0017R\u0019\u00106\u001a\u00020\u00118\u0007@\u0006¢\u0006\f\n\u0004\b6\u0010O\u001a\u0004\b6\u0010$R \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u0003\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010NR\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b?\u0010Q\u001a\u0004\b?\u0010<R\u0019\u0010R\u001a\u00020 8\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR\u0013\u00100\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010\u0017R\u0013\u0010:\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0019\u0010.\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\b.\u0010\u0017R\u0019\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0013\u0010,\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0019\u0010*\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\b*\u0010\u0017R\u0015\u0010K\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0013\u00108\u001a\u00020\u00118G@\u0006¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0013\u0010E\u001a\u00020\u00118G@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010$R\u001b\u0010M\u001a\u0004\u0018\u00010\n8\u0007@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010\u0017R\u0015\u0010C\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u0015\u0010A\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010\u0017¨\u0006Y"}, d2 = {"Lokhttp3/HttpUrl;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", DeepLinkIntentReceiver.DeepLinksKeys.URI, "()Ljava/net/URI;", "toUri", HttpUrl.FRAGMENT_ENCODE_SET, "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "index", "queryParameterName", "(I)Ljava/lang/String;", "queryParameterValue", "redact", "()Ljava/lang/String;", "link", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "scheme", "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", "username", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "password", "-deprecated_host", "host", "-deprecated_port", "port", "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", "query", "-deprecated_querySize", "querySize", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "fragment", "Ljava/lang/String;", "I", "queryNamesAndValues", "Ljava/util/List;", "isHttps", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 e2\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\bd\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u001eJ\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\u001eJ\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010\u001eJ\u001d\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b0\u0010%J\u0015\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00103\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b3\u0010\u001eJ\u001f\u00106\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b:\u00107J\u001f\u0010;\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b;\u00107J\u001f\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b<\u00107J\u0015\u0010=\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0005¢\u0006\u0004\b=\u0010\u001eJ\u0015\u0010>\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\b>\u0010\u001eJ\u0017\u0010?\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b?\u0010\u001eJ\u0017\u0010@\u001a\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b@\u0010\u001eJ\u000f\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010E\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010D2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\bJ\u0010KR\"\u0010$\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010M\u001a\u0004\bN\u0010\u0004\"\u0004\bO\u0010PR,\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\"\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010X\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010\u000eR\"\u0010 \u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010X\u001a\u0004\b[\u0010H\"\u0004\b\\\u0010\u000eR$\u0010#\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010X\u001a\u0004\b]\u0010H\"\u0004\b^\u0010\u000eR$\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\b_\u0010H\"\u0004\b`\u0010\u000eR$\u0010@\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010X\u001a\u0004\ba\u0010H\"\u0004\bb\u0010\u000eR\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050Q8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bc\u0010U¨\u0006f"}, d2 = {"Lokhttp3/HttpUrl$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "effectivePort", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "pathSegments", HttpUrl.FRAGMENT_ENCODE_SET, "alreadyEncoded", "addPathSegments", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Lkotlin/u;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "input", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "pop", "()V", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", HttpUrl.FRAGMENT_ENCODE_SET, "encodedQueryNamesAndValues", "Ljava/util/List;", "getEncodedQueryNamesAndValues$okhttp", "()Ljava/util/List;", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "Ljava/lang/String;", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getHost$okhttp", "setHost$okhttp", "getScheme$okhttp", "setScheme$okhttp", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "getEncodedPathSegments$okhttp", "<init>", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
        private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "input", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", "schemeDelimiterOffset", "(Ljava/lang/String;II)I", "slashCount", "portColonOffset", "parsePort", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char charAt = input.charAt(pos);
                    if (charAt == ':') {
                        return pos;
                    }
                    if (charAt != '[') {
                        pos++;
                    }
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                        pos++;
                    } while (input.charAt(pos) != ']');
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char charAt = input.charAt(pos);
                if ((l.h(charAt, 97) < 0 || l.h(charAt, 122) > 0) && (l.h(charAt, 65) < 0 || l.h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            l.c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            boolean m;
            if (l.a(input, ".")) {
                return true;
            }
            m = u.m(input, "%2e", true);
            return m;
        }

        private final boolean isDotDot(String input) {
            boolean m;
            boolean m2;
            boolean m3;
            if (l.a(input, "..")) {
                return true;
            }
            m = u.m(input, "%2e.", true);
            if (m) {
                return true;
            }
            m2 = u.m(input, ".%2e", true);
            if (m2) {
                return true;
            }
            m3 = u.m(input, "%2e%2e", true);
            return m3;
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            IntProgression g2;
            IntProgression h2;
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            g2 = f.g(list.size() - 2, 0);
            h2 = f.h(g2, 2);
            int f19489g = h2.getF19489g();
            int f19490h = h2.getF19490h();
            int f19491i = h2.getF19491i();
            if (f19491i >= 0) {
                if (f19489g > f19490h) {
                    return;
                }
            } else if (f19489g < f19490h) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                l.c(list2);
                if (l.a(canonicalName, list2.get(f19489g))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    l.c(list3);
                    list3.remove(f19489g + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    l.c(list4);
                    list4.remove(f19489g);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    l.c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (f19489g == f19490h) {
                    return;
                } else {
                    f19489g += f19491i;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char charAt = input.charAt(startPos);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                startPos++;
            }
            while (true) {
                int i2 = startPos;
                if (i2 >= limit) {
                    return;
                }
                startPos = Util.delimiterOffset(input, "/\\", i2, limit);
                boolean z = startPos < limit;
                push(input, i2, startPos, z, true);
                if (z) {
                    startPos++;
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            l.f(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            l.f(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            l.f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.c(list2);
            list2.add(encodedValue != null ? Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            l.f(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            l.f(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String value) {
            l.f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.c(list2);
            list2.add(value != null ? Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            int t;
            ArrayList arrayList;
            int t2;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.INSTANCE;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    t = kotlin.collections.u.t(list, 10);
                    ArrayList arrayList2 = new ArrayList(t);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        t2 = kotlin.collections.u.t(list2, 10);
                        arrayList = new ArrayList(t2);
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            l.f(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            boolean A;
            l.f(encodedPath, "encodedPath");
            A = u.A(encodedPath, "/", false, 2, null);
            if (A) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        public final Builder encodedQuery(String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                Companion companion = HttpUrl.INSTANCE;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, encodedQuery, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            l.f(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            this.encodedFragment = fragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null) : null;
            return this;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            l.f(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final Builder parse$okhttp(HttpUrl base, String input) {
            int delimiterOffset;
            int i2;
            int i3;
            String str;
            int i4;
            String str2;
            int i5;
            boolean z;
            boolean z2;
            boolean x;
            boolean x2;
            l.f(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c2 = 65535;
            if (schemeDelimiterOffset != -1) {
                x = u.x(input, "https:", indexOfFirstNonAsciiWhitespace$default, true);
                if (x) {
                    this.scheme = BuildConfig.APTOIDE_WEB_SERVICES_SCHEME;
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    x2 = u.x(input, "http:", indexOfFirstNonAsciiWhitespace$default, true);
                    if (x2) {
                        this.scheme = "http";
                        indexOfFirstNonAsciiWhitespace$default += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, schemeDelimiterOffset);
                        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (slashCount < 2 && base != null && !(!l.a(base.scheme(), this.scheme))) {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i2 = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i6 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i6, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : (char) 65535;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        break;
                    }
                    if (charAt != '@') {
                        str2 = str3;
                        i4 = indexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (!z3) {
                            int delimiterOffset2 = Util.delimiterOffset(input, ':', i6, delimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            i4 = indexOfLastNonAsciiWhitespace$default;
                            String str4 = str3;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i6, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z4) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                            z3 = z2;
                            str2 = str4;
                            z = true;
                            i5 = delimiterOffset;
                        } else {
                            i4 = indexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str3;
                            i5 = delimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, i6, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z = z4;
                        }
                        i6 = i5 + 1;
                        z4 = z;
                    }
                    str3 = str2;
                    indexOfLastNonAsciiWhitespace$default = i4;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                String str5 = str3;
                i2 = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int portColonOffset = companion3.portColonOffset(input, i6, delimiterOffset);
                int i7 = portColonOffset + 1;
                if (i7 < delimiterOffset) {
                    i3 = i6;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, input, i6, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i7, delimiterOffset);
                    this.port = parsePort;
                    if (!(parsePort != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = input.substring(i7, delimiterOffset);
                        l.e(substring2, str5);
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i3 = i6;
                    str = str5;
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i3, portColonOffset, false, 4, null));
                    String str6 = this.scheme;
                    l.c(str6);
                    this.port = companion4.defaultPort(str6);
                }
                if (!(this.host != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = input.substring(i3, portColonOffset);
                    l.e(substring3, str);
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            }
            int i8 = i2;
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i8);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i8 && input.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(input, '#', delimiterOffset3, i8);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i8 && input.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, delimiterOffset3 + 1, i8, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            l.f(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 <= port && 65535 >= port) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        public final Builder query(String query) {
            List<String> list;
            if (query != null) {
                Companion companion = HttpUrl.INSTANCE;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, query, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").c(str, HttpUrl.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.encodedPathSegments;
                list.set(i2, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, list.get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = list2.get(i3);
                    list2.set(i3, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            l.f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            l.f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            boolean m;
            boolean m2;
            l.f(scheme, "scheme");
            m = u.m(scheme, "http", true);
            if (m) {
                this.scheme = "http";
            } else {
                m2 = u.m(scheme, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, true);
                if (!m2) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = BuildConfig.APTOIDE_WEB_SERVICES_SCHEME;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            l.f(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            l.f(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            l.f(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            l.f(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            l.f(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(index, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i2) {
            this.port = i2;
        }

        public final Builder setQueryParameter(String name, String value) {
            l.f(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if ((r6.encodedPassword.length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        
            if (r1 != r3.defaultPort(r2)) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                kotlin.jvm.internal.l.c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.l.E(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.INSTANCE
                kotlin.jvm.internal.l.c(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.l.c(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.l.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            l.f(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            int i2 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i2, pathSegments.length());
                push(pathSegments, i2, delimiterOffset, delimiterOffset < pathSegments.length(), alreadyEncoded);
                i2 = delimiterOffset + 1;
            } while (i2 <= pathSegments.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ]\u0010\u0016\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b\"\u0010 J\u001b\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$*\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010+\u001a\u00020(*\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u00020.H\u0007¢\u0006\u0004\b)\u0010/J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u000200H\u0007¢\u0006\u0004\b)\u00101J\u0017\u0010)\u001a\u00020(2\u0006\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b3\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010(2\u0006\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b4\u0010*J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00102\u001a\u00020.H\u0007¢\u0006\u0004\b3\u0010/J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00105\u001a\u000200H\u0007¢\u0006\u0004\b3\u00101J1\u00108\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u00107Jc\u0010;\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010D\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010=R\u0016\u0010E\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010F\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010=R\u0016\u0010G\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010H\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010=R\u0016\u0010I\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010=R\u0016\u0010J\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010=¨\u0006M"}, d2 = {"Lokhttp3/HttpUrl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/f;", HttpUrl.FRAGMENT_ENCODE_SET, "encoded", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", HttpUrl.FRAGMENT_ENCODE_SET, "plusIsSpace", "Lkotlin/u;", "writePercentDecoded", "(Lj/f;Ljava/lang/String;IIZ)V", "isPercentEncoded", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "(Lj/f;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "defaultPort", "(Ljava/lang/String;)I", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", HttpUrl.FRAGMENT_ENCODE_SET, "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", DeepLinkIntentReceiver.DeepLinksKeys.URI, "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", HttpUrl.FRAGMENT_ENCODE_SET, "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4, Object obj) {
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.parseHexDigit(str.charAt(i2 + 1)) != -1 && Util.parseHexDigit(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i2, i3, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
        
            if (isPercentEncoded(r16, r5, r18) == false) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(j.f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc5
                if (r1 == 0) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2b
                r8 = 9
                if (r7 == r8) goto L26
                r8 = 10
                if (r7 == r8) goto L26
                r8 = 12
                if (r7 == r8) goto L26
                r8 = 13
                if (r7 == r8) goto L26
                goto L2b
            L26:
                r8 = r14
                r12 = r19
                goto Lb5
            L2b:
                r8 = 43
                if (r7 != r8) goto L3c
                if (r22 == 0) goto L3c
                if (r20 == 0) goto L36
                java.lang.String r8 = "+"
                goto L38
            L36:
                java.lang.String r8 = "%2B"
            L38:
                r15.M(r8)
                goto L26
            L3c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6c
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4c
                if (r23 == 0) goto L6c
            L4c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.l.E(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6a
                if (r7 != r9) goto L65
                if (r20 == 0) goto L6a
                if (r21 == 0) goto L65
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L66
                goto L6f
            L65:
                r8 = r14
            L66:
                r15.Y0(r7)
                goto Lb5
            L6a:
                r8 = r14
                goto L6f
            L6c:
                r8 = r14
                r12 = r19
            L6f:
                if (r6 != 0) goto L76
                j.f r6 = new j.f
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.l.a(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.U0(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.Y0(r7)
            L8d:
                boolean r10 = r6.u()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(j.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(j.f fVar, String str, int i2, int i3, boolean z) {
            int i4;
            while (i2 < i3) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i2);
                    if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                        int parseHexDigit = Util.parseHexDigit(str.charAt(i2 + 1));
                        int parseHexDigit2 = Util.parseHexDigit(str.charAt(i4));
                        if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                            fVar.writeByte((parseHexDigit << 4) + parseHexDigit2);
                            i2 = Character.charCount(codePointAt) + i4;
                        }
                        fVar.Y0(codePointAt);
                        i2 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            fVar.writeByte(32);
                            i2++;
                        }
                        fVar.Y0(codePointAt);
                        i2 += Character.charCount(codePointAt);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m441deprecated_get(String url) {
            l.f(url, "url");
            return get(url);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m444deprecated_parse(String url) {
            l.f(url, "url");
            return parse(url);
        }

        public final String canonicalize$okhttp(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            boolean E;
            l.f(str, "$this$canonicalize");
            l.f(str2, "encodeSet");
            int i4 = i2;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    E = v.E(str2, (char) codePointAt, false, 2, null);
                    if (!E) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!isPercentEncoded(str, i4, i3)) {
                                        j.f fVar = new j.f();
                                        fVar.U(str, i2, i4);
                                        writeCanonicalized(fVar, str, i4, i3, str2, z, z2, z3, z4, charset);
                                        return fVar.D0();
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i4 += Character.charCount(codePointAt);
                                    } else {
                                        j.f fVar2 = new j.f();
                                        fVar2.U(str, i2, i4);
                                        writeCanonicalized(fVar2, str, i4, i3, str2, z, z2, z3, z4, charset);
                                        return fVar2.D0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i4 += Character.charCount(codePointAt);
                    }
                }
                j.f fVar22 = new j.f();
                fVar22.U(str, i2, i4);
                writeCanonicalized(fVar22, str, i4, i3, str2, z, z2, z3, z4, charset);
                return fVar22.D0();
            }
            String substring = str.substring(i2, i3);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String scheme) {
            l.f(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            l.f(str, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            l.f(str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i2, int i3, boolean z) {
            l.f(str, "$this$percentDecode");
            for (int i4 = i2; i4 < i3; i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    j.f fVar = new j.f();
                    fVar.U(str, i2, i4);
                    writePercentDecoded(fVar, str, i4, i3, z);
                    return fVar.D0();
                }
            }
            String substring = str.substring(i2, i3);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            l.f(list, "$this$toPathString");
            l.f(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            int R;
            int R2;
            l.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                R = v.R(str, '&', i2, false, 4, null);
                if (R == -1) {
                    R = str.length();
                }
                int i3 = R;
                R2 = v.R(str, '=', i2, false, 4, null);
                if (R2 != -1 && R2 <= i3) {
                    String substring = str.substring(i2, R2);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(R2 + 1, i3);
                    l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i2, i3);
                    l.e(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            IntRange i2;
            IntProgression h2;
            l.f(list, "$this$toQueryString");
            l.f(sb, "out");
            i2 = f.i(0, list.size());
            h2 = f.h(i2, 2);
            int f19489g = h2.getF19489g();
            int f19490h = h2.getF19490h();
            int f19491i = h2.getF19491i();
            if (f19491i >= 0) {
                if (f19489g > f19490h) {
                    return;
                }
            } else if (f19489g < f19490h) {
                return;
            }
            while (true) {
                String str = list.get(f19489g);
                String str2 = list.get(f19489g + 1);
                if (f19489g > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (f19489g == f19490h) {
                    return;
                } else {
                    f19489g += f19491i;
                }
            }
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m443deprecated_get(URL url) {
            l.f(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            l.f(url, "$this$toHttpUrlOrNull");
            String url2 = url.toString();
            l.e(url2, "toString()");
            return parse(url2);
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m442deprecated_get(URI uri) {
            l.f(uri, DeepLinkIntentReceiver.DeepLinksKeys.URI);
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            l.f(uri, "$this$toHttpUrlOrNull");
            String uri2 = uri.toString();
            l.e(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        l.f(str, "scheme");
        l.f(str2, "username");
        l.f(str3, "password");
        l.f(str4, "host");
        l.f(list, "pathSegments");
        l.f(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i2;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = l.a(str, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m422deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m423deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m424deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m425deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m426deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m427deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m431deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m432deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m434deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m435deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m436deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m438deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m439deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        int R;
        if (this.fragment == null) {
            return null;
        }
        R = v.R(this.url, '#', 0, false, 6, null);
        int i2 = R + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i2);
        l.e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        int R;
        int R2;
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        R = v.R(this.url, ':', this.scheme.length() + 3, false, 4, null);
        int i2 = R + 1;
        R2 = v.R(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i2, R2);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int R;
        R = v.R(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", R, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(R, delimiterOffset);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int R;
        R = v.R(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", R, str.length());
        ArrayList arrayList = new ArrayList();
        while (R < delimiterOffset) {
            int i2 = R + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i2, delimiterOffset);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i2, delimiterOffset2);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            R = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        int R;
        if (this.queryNamesAndValues == null) {
            return null;
        }
        R = v.R(this.url, '?', 0, false, 6, null);
        int i2 = R + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', i2, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(i2, delimiterOffset);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(length, delimiterOffset);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && l.a(((HttpUrl) other).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        IntRange i2;
        IntProgression h2;
        l.f(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        i2 = f.i(0, list.size());
        h2 = f.h(i2, 2);
        int f19489g = h2.getF19489g();
        int f19490h = h2.getF19490h();
        int f19491i = h2.getF19491i();
        if (f19491i < 0 ? f19489g >= f19490h : f19489g <= f19490h) {
            while (!l.a(name, this.queryNamesAndValues.get(f19489g))) {
                if (f19489g != f19490h) {
                    f19489g += f19491i;
                }
            }
            return this.queryNamesAndValues.get(f19489g + 1);
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(index * 2);
            l.c(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        IntRange i2;
        IntProgression h2;
        Set<String> d2;
        if (this.queryNamesAndValues == null) {
            d2 = u0.d();
            return d2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i2 = f.i(0, this.queryNamesAndValues.size());
        h2 = f.h(i2, 2);
        int f19489g = h2.getF19489g();
        int f19490h = h2.getF19490h();
        int f19491i = h2.getF19491i();
        if (f19491i < 0 ? f19489g >= f19490h : f19489g <= f19490h) {
            while (true) {
                String str = this.queryNamesAndValues.get(f19489g);
                l.c(str);
                linkedHashSet.add(str);
                if (f19489g == f19490h) {
                    break;
                }
                f19489g += f19491i;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l.e(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        IntRange i2;
        IntProgression h2;
        List<String> i3;
        l.f(name, "name");
        if (this.queryNamesAndValues == null) {
            i3 = t.i();
            return i3;
        }
        ArrayList arrayList = new ArrayList();
        i2 = f.i(0, this.queryNamesAndValues.size());
        h2 = f.h(i2, 2);
        int f19489g = h2.getF19489g();
        int f19490h = h2.getF19490h();
        int f19491i = h2.getF19491i();
        if (f19491i < 0 ? f19489g >= f19490h : f19489g <= f19490h) {
            while (true) {
                if (l.a(name, this.queryNamesAndValues.get(f19489g))) {
                    arrayList.add(this.queryNamesAndValues.get(f19489g + 1));
                }
                if (f19489g == f19490h) {
                    break;
                }
                f19489g += f19491i;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        l.e(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        l.c(newBuilder);
        return newBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        l.f(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").c(builder, FRAGMENT_ENCODE_SET));
                l.e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String username() {
        return this.username;
    }

    public final Builder newBuilder(String link) {
        l.f(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
