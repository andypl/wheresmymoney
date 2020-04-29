package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Project;

import java.util.List;

public interface ProjectDAO extends GenericDAO<Project, Long>{

    @Override
    List<Project> getAll();
    List<Project> getProjectByProjectId(long projectId);
}
