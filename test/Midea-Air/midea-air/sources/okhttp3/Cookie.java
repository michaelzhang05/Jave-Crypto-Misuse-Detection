package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.text.Regex;
import kotlin.text.u;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u0000 -2\u00020\u0001:\u0002.-BQ\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\r\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'R\u0019\u0010\u001c\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010$\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0011\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\"\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u001e\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u001a\u001a\u00020\u00178\u0007@\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010 \u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0013\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b\u0013\u0010\u000f¨\u0006/"}, d2 = {"Lokhttp3/Cookie;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/HttpUrl;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "matches", "(Lokhttp3/HttpUrl;)Z", "other", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "-deprecated_name", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", "path", "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Z", "Ljava/lang/String;", "J", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: Cookie.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u001b"}, d2 = {"Lokhttp3/Cookie$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "domain", HttpUrl.FRAGMENT_ENCODE_SET, "hostOnly", "(Ljava/lang/String;Z)Lokhttp3/Cookie$Builder;", "name", "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", "value", HttpUrl.FRAGMENT_ENCODE_SET, "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "hostOnlyDomain", "path", "secure", "()Lokhttp3/Cookie$Builder;", "httpOnly", "Lokhttp3/Cookie;", "build", "()Lokhttp3/Cookie;", "Ljava/lang/String;", "persistent", "Z", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j2 = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j2, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder domain(String domain) {
            l.f(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DatesKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            l.f(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            CharSequence I0;
            l.f(name, "name");
            I0 = v.I0(name);
            if (l.a(I0.toString(), name)) {
                this.name = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final Builder path(String path) {
            boolean A;
            l.f(path, "path");
            A = u.A(path, "/", false, 2, null);
            if (A) {
                this.path = path;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            CharSequence I0;
            l.f(value, "value");
            I0 = v.I0(value);
            if (l.a(I0.toString(), value)) {
                this.value = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String domain, boolean hostOnly) {
            String canonicalHost = HostnamesKt.toCanonicalHost(domain);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = hostOnly;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + domain);
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'R\u001e\u0010*\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010,\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u001e\u0010-\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u0010.\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+¨\u00061"}, d2 = {"Lokhttp3/Cookie$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "urlHost", "domain", HttpUrl.FRAGMENT_ENCODE_SET, "domainMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lokhttp3/HttpUrl;", "url", "path", "pathMatch", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Z", "s", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", HttpUrl.FRAGMENT_ENCODE_SET, "parseExpires", "(Ljava/lang/String;II)J", "input", "invert", "dateCharacterOffset", "(Ljava/lang/String;IIZ)I", "parseMaxAge", "(Ljava/lang/String;)J", "parseDomain", "(Ljava/lang/String;)Ljava/lang/String;", "setCookie", "Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", HttpUrl.FRAGMENT_ENCODE_SET, "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String urlHost, String domain) {
            boolean l;
            if (l.a(urlHost, domain)) {
                return true;
            }
            l = u.l(urlHost, domain, false, 2, null);
            return l && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Util.canParseAsIpAddress(urlHost);
        }

        private final String parseDomain(String s) {
            boolean l;
            String g0;
            l = u.l(s, ".", false, 2, null);
            if (!l) {
                g0 = v.g0(s, ".");
                String canonicalHost = HostnamesKt.toCanonicalHost(g0);
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String s, int pos, int limit) {
            int S;
            int dateCharacterOffset = dateCharacterOffset(s, pos, limit, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (dateCharacterOffset < limit) {
                int dateCharacterOffset2 = dateCharacterOffset(s, dateCharacterOffset + 1, limit, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i3 != -1 || !matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    if (i4 != -1 || !matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                        if (i5 != -1 || !matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                            if (i2 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                                String group = matcher.group(1);
                                l.e(group, "matcher.group(1)");
                                i2 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            l.e(group2, "matcher.group(1)");
                            Locale locale = Locale.US;
                            l.e(locale, "Locale.US");
                            if (group2 != null) {
                                String lowerCase = group2.toLowerCase(locale);
                                l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                String pattern = Cookie.MONTH_PATTERN.pattern();
                                l.e(pattern, "MONTH_PATTERN.pattern()");
                                S = v.S(pattern, lowerCase, 0, false, 6, null);
                                i5 = S / 4;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        String group3 = matcher.group(1);
                        l.e(group3, "matcher.group(1)");
                        i4 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    l.e(group4, "matcher.group(1)");
                    i3 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    l.e(group5, "matcher.group(2)");
                    i6 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    l.e(group6, "matcher.group(3)");
                    i7 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(s, dateCharacterOffset2 + 1, limit, false);
            }
            if (70 <= i2 && 99 >= i2) {
                i2 += 1900;
            }
            if (i2 >= 0 && 69 >= i2) {
                i2 += 2000;
            }
            if (!(i2 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i4 && 31 >= i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i3 >= 0 && 23 >= i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && 59 >= i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i7 >= 0 && 59 >= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i2);
                gregorianCalendar.set(2, i5 - 1);
                gregorianCalendar.set(5, i4);
                gregorianCalendar.set(11, i3);
                gregorianCalendar.set(12, i6);
                gregorianCalendar.set(13, i7);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String s) {
            boolean A;
            try {
                long parseLong = Long.parseLong(s);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e2) {
                if (new Regex("-?\\d+").b(s)) {
                    A = u.A(s, "-", false, 2, null);
                    return A ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl url, String path) {
            boolean A;
            boolean l;
            String encodedPath = url.encodedPath();
            if (l.a(encodedPath, path)) {
                return true;
            }
            A = u.A(encodedPath, path, false, 2, null);
            if (A) {
                l = u.l(path, "/", false, 2, null);
                if (l || encodedPath.charAt(path.length()) == '/') {
                    return true;
                }
            }
            return false;
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            l.f(url, "url");
            l.f(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x0103, code lost:
        
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.Cookie parse$okhttp(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            List<Cookie> i2;
            l.f(url, "url");
            l.f(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            for (int i3 = 0; i3 < size; i3++) {
                Cookie parse = parse(url, values.get(i3));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                l.e(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            i2 = t.i();
            return i2;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (l.a(cookie.name, this.name) && l.a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && l.a(cookie.domain, this.domain) && l.a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + cm.aptoide.pt.aab.a.a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + c.a(this.secure)) * 31) + c.a(this.httpOnly)) * 31) + c.a(this.persistent)) * 31) + c.a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        boolean domainMatch;
        l.f(url, "url");
        if (!this.hostOnly) {
            domainMatch = INSTANCE.domainMatch(url.host(), this.domain);
        } else {
            domainMatch = l.a(url.host(), this.domain);
        }
        if (domainMatch && INSTANCE.pathMatch(url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        l.e(sb2, "toString()");
        return sb2;
    }

    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, g gVar) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }
}
