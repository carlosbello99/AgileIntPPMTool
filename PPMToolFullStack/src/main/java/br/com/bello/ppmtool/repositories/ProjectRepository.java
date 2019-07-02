package br.com.bello.ppmtool.repositories;

import br.com.bello.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {


    Project findByProjectIdentifier(String projectId);
}
