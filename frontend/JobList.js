import { useEffect, useState } from "react";
import axios from "axios";

function JobList() {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/jobs")
      .then(res => setJobs(res.data));
  }, []);

  return (
    <div>
      <h2>Available Jobs</h2>
      {jobs.map(job => (
        <div key={job.id}>
          <h4>{job.title}</h4>
          <p>{job.company} - {job.location}</p>
        </div>
      ))}
    </div>
  );
}

export default JobList;

