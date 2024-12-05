package retrofit2.converter.gson;

import com.google.gson.e;
import com.google.gson.q;
import com.google.gson.stream.c;
import j.f;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final q<T> adapter;
    private final e gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(e eVar, q<T> qVar) {
        this.gson = eVar;
        this.adapter = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        f fVar = new f();
        c o = this.gson.o(new OutputStreamWriter(fVar.w0(), UTF_8));
        this.adapter.d(o, t);
        o.close();
        return RequestBody.create(MEDIA_TYPE, fVar.X());
    }
}
