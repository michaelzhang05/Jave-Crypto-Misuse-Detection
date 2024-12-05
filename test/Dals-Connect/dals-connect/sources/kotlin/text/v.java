package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.IntIterator;
import kotlin.collections.m;
import kotlin.collections.n;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.s;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", HttpUrl.FRAGMENT_ENCODE_SET, "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", HttpUrl.FRAGMENT_ENCODE_SET, "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "commonPrefixWith", HttpUrl.FRAGMENT_ENCODE_SET, "other", "ignoreCase", HttpUrl.FRAGMENT_ENCODE_SET, "commonSuffixWith", "contains", "char", HttpUrl.FRAGMENT_ENCODE_SET, "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", HttpUrl.FRAGMENT_ENCODE_SET, "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", HttpUrl.FRAGMENT_ENCODE_SET, "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", HttpUrl.FRAGMENT_ENCODE_SET, "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class v extends u {

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f21592f;

        /* renamed from: g */
        final /* synthetic */ boolean f21593g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.f21592f = cArr;
            this.f21593g = z;
        }

        public final Pair<Integer, Integer> b(CharSequence charSequence, int i2) {
            l.f(charSequence, "$this$$receiver");
            int T = v.T(charSequence, this.f21592f, i2, this.f21593g);
            if (T < 0) {
                return null;
            }
            return s.a(Integer.valueOf(T), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List<String> f21594f;

        /* renamed from: g */
        final /* synthetic */ boolean f21595g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z) {
            super(2);
            this.f21594f = list;
            this.f21595g = z;
        }

        public final Pair<Integer, Integer> b(CharSequence charSequence, int i2) {
            l.f(charSequence, "$this$$receiver");
            Pair K = v.K(charSequence, this.f21594f, i2, this.f21595g, false);
            if (K != null) {
                return s.a(K.c(), Integer.valueOf(((String) K.d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<IntRange, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f21596f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f21596f = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final String invoke(IntRange intRange) {
            l.f(intRange, "it");
            return v.w0(this.f21596f, intRange);
        }
    }

    public static /* synthetic */ String A0(String str, String str2, String str3, int i2, Object obj) {
        String y0;
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        y0 = y0(str, str2, str3);
        return y0;
    }

    public static final String B0(String str, char c2, String str2) {
        int W;
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        W = W(str, c2, 0, false, 6, null);
        if (W == -1) {
            return str2;
        }
        String substring = str.substring(W + 1, str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean C(CharSequence charSequence, char c2, boolean z) {
        int R;
        l.f(charSequence, "<this>");
        R = R(charSequence, c2, 0, z, 2, null);
        return R >= 0;
    }

    public static /* synthetic */ String C0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return B0(str, c2, str2);
    }

    public static final boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int S;
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            S = S(charSequence, (String) charSequence2, 0, z, 2, null);
            if (S >= 0) {
                return true;
            }
        } else if (Q(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String D0(String str, char c2, String str2) {
        int R;
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        R = R(str, c2, 0, false, 6, null);
        if (R == -1) {
            return str2;
        }
        String substring = str.substring(0, R);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean E(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return C(charSequence, c2, z);
    }

    public static final String E0(String str, String str2, String str3) {
        int S;
        l.f(str, "<this>");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        S = S(str, str2, 0, false, 6, null);
        if (S == -1) {
            return str3;
        }
        String substring = str.substring(0, S);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return D(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String F0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return D0(str, c2, str2);
    }

    public static final boolean G(CharSequence charSequence, char c2, boolean z) {
        int M;
        l.f(charSequence, "<this>");
        if (charSequence.length() > 0) {
            M = M(charSequence);
            if (kotlin.text.c.d(charSequence.charAt(M), c2, z)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String G0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return E0(str, str2, str3);
    }

    public static final boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean l;
        l.f(charSequence, "<this>");
        l.f(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            l = u.l((String) charSequence, (String) charSequence2, false, 2, null);
            return l;
        }
        return f0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static String H0(String str, String str2, String str3) {
        int X;
        l.f(str, "<this>");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        X = X(str, str2, 0, false, 6, null);
        if (X == -1) {
            return str3;
        }
        String substring = str.substring(0, X);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return G(charSequence, c2, z);
    }

    public static CharSequence I0(CharSequence charSequence) {
        boolean c2;
        l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            c2 = kotlin.text.b.c(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!c2) {
                    break;
                }
                length--;
            } else if (c2) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return H(charSequence, charSequence2, z);
    }

    public static final Pair<Integer, String> K(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        int M;
        int d2;
        IntProgression g2;
        Object obj;
        Object obj2;
        int b2;
        if (!z && collection.size() == 1) {
            String str = (String) r.m0(collection);
            int S = !z2 ? S(charSequence, str, i2, false, 4, null) : X(charSequence, str, i2, false, 4, null);
            if (S < 0) {
                return null;
            }
            return s.a(Integer.valueOf(S), str);
        }
        if (z2) {
            M = M(charSequence);
            d2 = f.d(i2, M);
            g2 = f.g(d2, 0);
        } else {
            b2 = f.b(i2, 0);
            g2 = new IntRange(b2, charSequence.length());
        }
        if (charSequence instanceof String) {
            int f19489g = g2.getF19489g();
            int f19490h = g2.getF19490h();
            int f19491i = g2.getF19491i();
            if ((f19491i > 0 && f19489g <= f19490h) || (f19491i < 0 && f19490h <= f19489g)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (u.q(str2, 0, (String) charSequence, f19489g, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (f19489g == f19490h) {
                            break;
                        }
                        f19489g += f19491i;
                    } else {
                        return s.a(Integer.valueOf(f19489g), str3);
                    }
                }
            }
        } else {
            int f19489g2 = g2.getF19489g();
            int f19490h2 = g2.getF19490h();
            int f19491i2 = g2.getF19491i();
            if ((f19491i2 > 0 && f19489g2 <= f19490h2) || (f19491i2 < 0 && f19490h2 <= f19489g2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (f0(str4, 0, charSequence, f19489g2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (f19489g2 == f19490h2) {
                            break;
                        }
                        f19489g2 += f19491i2;
                    } else {
                        return s.a(Integer.valueOf(f19489g2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static IntRange L(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static int M(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int N(CharSequence charSequence, char c2, int i2, boolean z) {
        l.f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return T(charSequence, new char[]{c2}, i2, z);
    }

    public static final int O(CharSequence charSequence, String str, int i2, boolean z) {
        l.f(charSequence, "<this>");
        l.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return Q(charSequence, str, i2, charSequence.length(), z, false, 16, null);
    }

    private static final int P(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        int M;
        int d2;
        int b2;
        IntProgression g2;
        int b3;
        int d3;
        if (!z2) {
            b3 = f.b(i2, 0);
            d3 = f.d(i3, charSequence.length());
            g2 = new IntRange(b3, d3);
        } else {
            M = M(charSequence);
            d2 = f.d(i2, M);
            b2 = f.b(i3, 0);
            g2 = f.g(d2, b2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int f19489g = g2.getF19489g();
            int f19490h = g2.getF19490h();
            int f19491i = g2.getF19491i();
            if ((f19491i <= 0 || f19489g > f19490h) && (f19491i >= 0 || f19490h > f19489g)) {
                return -1;
            }
            while (!u.q((String) charSequence2, 0, (String) charSequence, f19489g, charSequence2.length(), z)) {
                if (f19489g == f19490h) {
                    return -1;
                }
                f19489g += f19491i;
            }
            return f19489g;
        }
        int f19489g2 = g2.getF19489g();
        int f19490h2 = g2.getF19490h();
        int f19491i2 = g2.getF19491i();
        if ((f19491i2 <= 0 || f19489g2 > f19490h2) && (f19491i2 >= 0 || f19490h2 > f19489g2)) {
            return -1;
        }
        while (!f0(charSequence2, 0, charSequence, f19489g2, charSequence2.length(), z)) {
            if (f19489g2 == f19490h2) {
                return -1;
            }
            f19489g2 += f19491i2;
        }
        return f19489g2;
    }

    static /* synthetic */ int Q(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return P(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int R(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return N(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return O(charSequence, str, i2, z);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        int b2;
        int M;
        boolean z2;
        char L;
        l.f(charSequence, "<this>");
        l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            L = n.L(cArr);
            return ((String) charSequence).indexOf(L, i2);
        }
        b2 = f.b(i2, 0);
        M = M(charSequence);
        IntIterator it = new IntRange(b2, M).iterator();
        while (it.hasNext()) {
            int a2 = it.a();
            char charAt = charSequence.charAt(a2);
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (kotlin.text.c.d(cArr[i3], charAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return a2;
            }
        }
        return -1;
    }

    public static final int U(CharSequence charSequence, char c2, int i2, boolean z) {
        l.f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        return Y(charSequence, new char[]{c2}, i2, z);
    }

    public static final int V(CharSequence charSequence, String str, int i2, boolean z) {
        l.f(charSequence, "<this>");
        l.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i2);
        }
        return P(charSequence, str, i2, 0, z, true);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = M(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return U(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = M(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return V(charSequence, str, i2, z);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        int M;
        int d2;
        char L;
        l.f(charSequence, "<this>");
        l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            L = n.L(cArr);
            return ((String) charSequence).lastIndexOf(L, i2);
        }
        M = M(charSequence);
        for (d2 = f.d(i2, M); -1 < d2; d2--) {
            char charAt = charSequence.charAt(d2);
            int length = cArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (kotlin.text.c.d(cArr[i3], charAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return d2;
            }
        }
        return -1;
    }

    public static final Sequence<String> Z(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return r0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> a0(CharSequence charSequence) {
        List<String> A;
        l.f(charSequence, "<this>");
        A = kotlin.sequences.n.A(Z(charSequence));
        return A;
    }

    private static final Sequence<IntRange> b0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3) {
        k0(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new a(cArr, z));
    }

    private static final Sequence<IntRange> c0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        List c2;
        k0(i3);
        c2 = m.c(strArr);
        return new DelimitedRangesSequence(charSequence, i2, i3, new b(c2, z));
    }

    static /* synthetic */ Sequence d0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return b0(charSequence, cArr, i2, z, i3);
    }

    static /* synthetic */ Sequence e0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return c0(charSequence, strArr, i2, z, i3);
    }

    public static final boolean f0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!kotlin.text.c.d(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static String g0(String str, CharSequence charSequence) {
        l.f(str, "<this>");
        l.f(charSequence, "prefix");
        if (!v0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String h0(String str, CharSequence charSequence) {
        l.f(str, "<this>");
        l.f(charSequence, "suffix");
        if (!J(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String i0(String str, CharSequence charSequence) {
        l.f(str, "<this>");
        l.f(charSequence, "delimiter");
        return j0(str, charSequence, charSequence);
    }

    public static final String j0(String str, CharSequence charSequence, CharSequence charSequence2) {
        l.f(str, "<this>");
        l.f(charSequence, "prefix");
        l.f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !v0(str, charSequence, false, 2, null) || !J(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void k0(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    public static final List<String> l0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        Iterable i3;
        int t;
        l.f(charSequence, "<this>");
        l.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return n0(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        i3 = kotlin.sequences.n.i(d0(charSequence, cArr, 0, z, i2, 2, null));
        t = u.t(i3, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = i3.iterator();
        while (it.hasNext()) {
            arrayList.add(w0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List<String> m0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        Iterable i3;
        int t;
        l.f(charSequence, "<this>");
        l.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return n0(charSequence, str, z, i2);
            }
        }
        i3 = kotlin.sequences.n.i(e0(charSequence, strArr, 0, z, i2, 2, null));
        t = u.t(i3, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = i3.iterator();
        while (it.hasNext()) {
            arrayList.add(w0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List<String> n0(CharSequence charSequence, String str, boolean z, int i2) {
        List<String> e2;
        k0(i2);
        int i3 = 0;
        int O = O(charSequence, str, 0, z);
        if (O != -1 && i2 != 1) {
            boolean z2 = i2 > 0;
            ArrayList arrayList = new ArrayList(z2 ? f.d(i2, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i3, O).toString());
                i3 = str.length() + O;
                if (z2 && arrayList.size() == i2 - 1) {
                    break;
                }
                O = O(charSequence, str, i3, z);
            } while (O != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        e2 = kotlin.collections.s.e(charSequence.toString());
        return e2;
    }

    public static /* synthetic */ List o0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return l0(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ List p0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m0(charSequence, strArr, z, i2);
    }

    public static final Sequence<String> q0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        Sequence<String> u;
        l.f(charSequence, "<this>");
        l.f(strArr, "delimiters");
        u = kotlin.sequences.n.u(e0(charSequence, strArr, 0, z, i2, 2, null), new c(charSequence));
        return u;
    }

    public static /* synthetic */ Sequence r0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return q0(charSequence, strArr, z, i2);
    }

    public static final boolean s0(CharSequence charSequence, char c2, boolean z) {
        l.f(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.c.d(charSequence.charAt(0), c2, z);
    }

    public static final boolean t0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean A;
        l.f(charSequence, "<this>");
        l.f(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            A = u.A((String) charSequence, (String) charSequence2, false, 2, null);
            return A;
        }
        return f0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean u0(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return s0(charSequence, c2, z);
    }

    public static /* synthetic */ boolean v0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return t0(charSequence, charSequence2, z);
    }

    public static final String w0(CharSequence charSequence, IntRange intRange) {
        l.f(charSequence, "<this>");
        l.f(intRange, "range");
        return charSequence.subSequence(intRange.J().intValue(), intRange.D().intValue() + 1).toString();
    }

    public static final String x0(String str, char c2, String str2) {
        int R;
        l.f(str, "<this>");
        l.f(str2, "missingDelimiterValue");
        R = R(str, c2, 0, false, 6, null);
        if (R == -1) {
            return str2;
        }
        String substring = str.substring(R + 1, str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String y0(String str, String str2, String str3) {
        int S;
        l.f(str, "<this>");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        S = S(str, str2, 0, false, 6, null);
        if (S == -1) {
            return str3;
        }
        String substring = str.substring(S + str2.length(), str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String z0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return x0(str, c2, str2);
    }
}
