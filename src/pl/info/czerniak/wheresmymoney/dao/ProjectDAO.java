package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Project;

import java.util.List;

public interface ProjectDAO extends GenericDAO<Project, Long>{

    @Override
    List<Project> getAll();
    public List<Project> getProjectByProjectId(long projectId);
}
