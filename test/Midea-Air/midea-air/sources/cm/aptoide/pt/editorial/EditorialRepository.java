package cm.aptoide.pt.editorial;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.HttpUrl;
import rx.Single;

/* compiled from: EditorialRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcm/aptoide/pt/editorial/EditorialRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "editorialService", "Lcm/aptoide/pt/editorial/EditorialService;", "(Lcm/aptoide/pt/editorial/EditorialService;)V", "cachedEditorialViewModel", "Lcm/aptoide/pt/editorial/EditorialViewModel;", "loadEditorialViewModel", "Lrx/Single;", "editorialLoadSource", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "saveResponse", "editorialViewModel", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditorialRepository {
    private EditorialViewModel cachedEditorialViewModel;
    private final EditorialService editorialService;

    public EditorialRepository(EditorialService editorialService) {
        kotlin.jvm.internal.l.f(editorialService, "editorialService");
        this.editorialService = editorialService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadEditorialViewModel$lambda-0, reason: not valid java name */
    public static final EditorialViewModel m144loadEditorialViewModel$lambda0(EditorialRepository editorialRepository, EditorialViewModel editorialViewModel) {
        kotlin.jvm.internal.l.f(editorialRepository, "this$0");
        kotlin.jvm.internal.l.e(editorialViewModel, "editorialViewModel");
        return editorialRepository.saveResponse(editorialViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadEditorialViewModel$lambda-1, reason: not valid java name */
    public static final EditorialViewModel m145loadEditorialViewModel$lambda1(EditorialRepository editorialRepository, EditorialViewModel editorialViewModel) {
        kotlin.jvm.internal.l.f(editorialRepository, "this$0");
        kotlin.jvm.internal.l.e(editorialViewModel, "editorialViewModel");
        return editorialRepository.saveResponse(editorialViewModel);
    }

    private final EditorialViewModel saveResponse(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.hasError() && !editorialViewModel.isLoading()) {
            this.cachedEditorialViewModel = editorialViewModel;
        }
        return editorialViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Single<EditorialViewModel> loadEditorialViewModel(EditorialLoadSource editorialLoadSource) {
        Single single;
        kotlin.jvm.internal.l.f(editorialLoadSource, "editorialLoadSource");
        EditorialViewModel editorialViewModel = this.cachedEditorialViewModel;
        if (editorialViewModel != null) {
            Single<EditorialViewModel> m = Single.m(editorialViewModel);
            kotlin.jvm.internal.l.e(m, "just(cachedEditorialViewModel)");
            return m;
        }
        if (editorialLoadSource instanceof CardId) {
            single = this.editorialService.loadEditorialViewModel(((CardId) editorialLoadSource).getCardId()).n(new rx.m.e() { // from class: cm.aptoide.pt.editorial.b6
                @Override // rx.m.e
                public final Object call(Object obj) {
                    EditorialViewModel m144loadEditorialViewModel$lambda0;
                    m144loadEditorialViewModel$lambda0 = EditorialRepository.m144loadEditorialViewModel$lambda0(EditorialRepository.this, (EditorialViewModel) obj);
                    return m144loadEditorialViewModel$lambda0;
                }
            });
        } else {
            if (!(editorialLoadSource instanceof Slug)) {
                throw new NoWhenBranchMatchedException();
            }
            single = this.editorialService.loadEditorialViewModelWithSlug(((Slug) editorialLoadSource).getSlug()).n(new rx.m.e() { // from class: cm.aptoide.pt.editorial.a6
                @Override // rx.m.e
                public final Object call(Object obj) {
                    EditorialViewModel m145loadEditorialViewModel$lambda1;
                    m145loadEditorialViewModel$lambda1 = EditorialRepository.m145loadEditorialViewModel$lambda1(EditorialRepository.this, (EditorialViewModel) obj);
                    return m145loadEditorialViewModel$lambda1;
                }
            });
        }
        kotlin.jvm.internal.l.e(single, "when (editorialLoadSourc…wModel)\n        }\n      }");
        return single;
    }
}
