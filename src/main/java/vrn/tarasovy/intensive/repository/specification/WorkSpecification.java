package vrn.tarasovy.intensive.repository.specification;

import lombok.experimental.UtilityClass;

import javax.persistence.criteria.Join;
import java.time.LocalDate;
import java.util.UUID;


@UtilityClass
public class WorkSpecification {

    public static Specification<Work> getEmptySpec() {
        return (root, query, cb) -> cb.and();
    }

    public static Specification<Work> getWorkByDrawingNumber(String drawingNumber) {
        return (root, query, cb) -> {
            Join<Work, Drawing> join = root.join(Work_.DRAWING);
            return cb.equal(join.get(Drawing_.DRAWING_NUMBER), drawingNumber);
        };
    }

    public static Specification<Work> getWorkByTitle(UUID titleId) {
        return (root, query, cb) -> {
            Join<Work, Drawing> drawingJoin = root.join(Work_.DRAWING);
            Join<Drawing, Title> titleJoin = drawingJoin.join(Drawing_.TITLE);
            return cb.equal(titleJoin.get(IdentityDao_.ID), titleId);
        };
    }

    public static Specification<Work> getWorkByProject(UUID projectId) {
        return (root, query, cb) -> {
            Join<Work, Drawing> drawingJoin = root.join(Work_.DRAWING);
            Join<Drawing, Title> titleJoin = drawingJoin.join(Drawing_.TITLE);
            Join<Title, Project> projectJoin = titleJoin.join(Title_.PROJECT);
            return cb.equal(projectJoin.get(IdentityDao_.ID), projectId);
        };
    }

    public static Specification<Work> getWorkByContractorId(UUID contractorId) {
        return (root, query, cb) -> {
            Join<Work, LegalEntityHistory> leHistoryJoin = root.join(Work_.CONTRACTOR);
            Join<LegalEntityHistory, LegalEntity> leJoin = leHistoryJoin.join(LegalEntityHistory_.LEGAL_ENTITY);
            return cb.equal(leJoin.get(IdentityDao_.ID), contractorId);
        };
    }

    public static Specification<Work> getWorkBySubContractorId(UUID subContractorId) {
        return (root, query, cb) -> {
            Join<Work, LegalEntityHistory> leHistoryJoin = root.join(Work_.SUB_CONTRACTOR);
            Join<LegalEntityHistory, LegalEntity> leJoin = leHistoryJoin.join(LegalEntityHistory_.LEGAL_ENTITY);
            return cb.equal(leJoin.get(IdentityDao_.ID), subContractorId);
        };
    }

    public static Specification<Work> getWorkByParamValueEquals(String paramValue, String paramCode) {
        return (root, query, cb) -> {
            Join<Work, WorkParameterValue> paramValueJoin = root.join(Work_.PARAMETERS);
            Join<WorkParameterValue, WorkKindParameter> workKindParamJoin = paramValueJoin.join(WorkParameterValue_.PARAMETER);
            Join<WorkKindParameter, Parameter> paramJoin = workKindParamJoin.join(WorkKindParameter_.PARAMETER);
            return cb.and(
                    cb.equal(paramJoin.get(Parameter_.CODE), paramCode),
                    cb.equal(paramValueJoin.get(WorkParameterValue_.VALUE), paramValue)
            );
        };
    }

    public static Specification<Work> getWorkByParamValueLike(String paramValue, String paramCode) {
        return (root, query, cb) -> {
            Join<Work, WorkParameterValue> paramValueJoin = root.join(Work_.PARAMETERS);
            Join<WorkParameterValue, WorkKindParameter> workKindParamJoin = paramValueJoin.join(WorkParameterValue_.PARAMETER);
            Join<WorkKindParameter, Parameter> paramJoin = workKindParamJoin.join(WorkKindParameter_.PARAMETER);
            return cb.and(
                    cb.equal(paramJoin.get(Parameter_.CODE), paramCode),
                    cb.like(cb.upper(paramValueJoin.get(WorkParameterValue_.VALUE)), toLikeUpperPattern(paramValue))
            );
        };
    }

    public static Specification<Work> getWorkByDateFrom(LocalDate dateFrom) {
        return (root, query, cb) -> cb.greaterThanOrEqualTo(root.get(Work_.WORK_DATE_FROM), dateFrom);
    }

    public static Specification<Work> getWorkByDateTo(LocalDate dateTo) {
        return (root, query, cb) -> cb.lessThanOrEqualTo(root.get(Work_.WORK_DATE_FROM), dateTo);
    }

    public static Specification<Work> getWorkByDateFromExact(LocalDate dateFromExact) {
        return (root, query, cb) -> cb.equal(root.get(Work_.WORK_DATE_FROM), dateFromExact);
    }

    public static Specification<Work> getWorkByDateToExact(LocalDate dateToExact) {
        return (root, query, cb) -> cb.equal(root.get(Work_.WORK_DATE_TO), dateToExact);
    }

    public static Specification<Work> getWorkByConstructionName(String constructionName) {
        return (root, query, cb) -> cb.equal(root.get(Work_.CONSTRUCTION_NAME), constructionName);
    }

    public static Specification<Work> getWorkByWorkKindId(UUID workKindId) {
        return (root, query, cb) -> {
            Join<Work, WorkKindDictionary> join = root.join(Work_.WORK_KIND);
            return cb.equal(join.get(IdentityDao_.ID), workKindId);
        };
    }
}
