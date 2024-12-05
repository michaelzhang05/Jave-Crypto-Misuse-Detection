package cm.aptoide.pt.reactions.network;

import rx.m.e;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ReactionsRemoteService f6648f;

    public /* synthetic */ b(ReactionsRemoteService reactionsRemoteService) {
        this.f6648f = reactionsRemoteService;
    }

    @Override // rx.m.e
    public final Object call(Object obj) {
        return ReactionsRemoteService.b(this.f6648f, (Throwable) obj);
    }
}
